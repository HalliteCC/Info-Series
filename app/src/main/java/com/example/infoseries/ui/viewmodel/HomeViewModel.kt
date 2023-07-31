package com.example.infoseries.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.infoseries.domain.model.SerieModel
import com.example.infoseries.retrofit.Client

class HomeViewModel : ViewModel() {

    private val _series = MutableLiveData<List<SerieModel>>()
    val series: LiveData<List<SerieModel>> = _series

 fun all (){
     val apiCliente = Client()
     apiCliente.getRetrofitInstance()

 }

}