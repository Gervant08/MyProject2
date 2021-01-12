package com.gervant08.myapplication.model.tools

import androidx.lifecycle.MutableLiveData
import com.gervant08.myapplication.model.data.Element

object PoolOfDeletedItems{  // Pool Of Deleted Items
    val pool = MutableLiveData<ArrayList<Element>>(arrayListOf())
}