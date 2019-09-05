package com.example.tae_kotlin_rxjava2_starwars

import android.os.Bundle
import android.util.Log
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import com.example.tae_kotlin_rxjava2_starwars.models.StarWarsModel
import com.example.tae_kotlin_rxjava2_starwars.network.RetrofitInstance
import com.example.tae_kotlin_rxjava2_starwars.network.RetrofitInterface
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {


    private var adapter: Adapter? = null
    private var myCompositeDisposable = CompositeDisposable()
    private var starWarsList: List<StarWarsModel>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val movieRequest = RetrofitInstance().retrofitInstance.create(RetrofitInterface::class.java)
        val call = movieRequest.getData()

        myCompositeDisposable.add(

            call.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse, this::handleError)

        )


    }
    private fun handleResponse(starWarsModel: StarWarsModel) {
        val res = starWarsModel.results
        Log.i("Actor Name ", ""+res[0].name)
    }


    private fun handleError(error: Throwable) {
        Log.d("Actors Error ", ""+error.message)
    }

}

//        val myCompositeDisposable = CompositeDisposable()
//        initRecyclerView()
//        loadData()

//        private fun initRecyclerView() {
//            val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
//            starWarsList.layoutManager = layoutManager
//        }

//        private fun loadData() {
//            val requestInterface = Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build().create(RetrofitInterface::class.java)
//
//            myCompositeDisposable?.add(
//                requestInterface.getData()
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribeOn(Schedulers.io())
//                    .subscribe(this::handleResponse)
//            )
//        }
//}


//        private fun handleResponse(starWarsList: List<StarWarsModel>) {
//            myStarWarsInfoList = List(starWarsList)
//            myAdapter = MyAdapter(myStarWarsInfoList!!, this)
//
//            fl_fragment_layout.adapter = myAdapter
//        }
//
//
//    val StarWarsRequest = RetrofitInstance()
//        .retrofitInstance.create(RetrofitInterface::class.java)
//


//        //adapter
//        starWarsAdapter = StarWarsAdapter()
//        starWarsList.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
//        starWarsList.adapter = starWarsAdapter
//
//        val retrofit:Retrofit = Retrofit.Builder()
//            .baseUrl(Constants.BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .build()
//
//        val retrofitInstance = retrofit.create(StarWarsModel::class.java)
//
//
//        RetrofitInterface.setInfo()
//            .sub
//
//
//
//    }

//    inner class StarWarsAdapter : RecyclerView.Adapter<StarWarsModel.StarWarsViewHolder>(){
//
//        private val starWarsInfo: MutableList<StarWarsModel> = mutableListOf()
//
//        override fun onCreateViewHolder(
//            parent: ViewGroup,
//            viewType: Int
//        ): StarWarsModel.StarWarsViewHolder {
//            return StarWarsViewHolder(layoutInflater.inflate(R.layout))
//        }
//
//        override fun getItemCount(): Int {
//
//            return starWarsInfo.size
//        }

//        override fun onBindViewHolder(holder: StarWarsModel.StarWarsViewHolder, position: Int) {
//            holder.bindModel(starWarsInfo[position])
//        }
//
//        fun setInfo(data:List<Results>){
//            starWarsInfo.addAll(data)
//            notifyDataSetChanged()
//        }
//
//        inner class StarWarsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//            val name: TextView = itemView.findViewById(R.id.tv_name)
//            val height: TextView = itemView.findViewById(R.id.tv_height)
//            val mass: TextView = itemView.findViewById(R.id.tv_mass)
//
//            find bindModel(results:Results){
//                name.text = result.
//            }
//        }
//
//}
//
//
//private fun addFragment() {
//    val fragmentManager = supportFragmentManager
//    val fragmentTransaction = fragmentManager.beginTransaction()
//    fragmentTransaction.add(R.id.fl_fragment_layout, FragmentActivity())
//        .commit()
//}
//
//
//companion object {
//
//    const val COMBINED_LIFECYCLE = "combine_lifeCycle"
//    const val ACTIVITY = "MainActivity"
//    const val FRAGMENT = "fragmentExample"
//}
//}
