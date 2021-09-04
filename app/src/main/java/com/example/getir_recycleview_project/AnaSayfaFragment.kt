package com.example.getir_recycleview_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager


class AnaSayfaFragment : Fragment() {

      private lateinit var tasarim:View
      private lateinit var dataSet:ArrayList<Category>
      private lateinit var layoutmanager:RecyclerView.LayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

          tasarim=inflater.inflate(R.layout.fragment_ana_sayfa, container, false)
          dataSet=ArrayList<Category>()
          dataSet.add(Category("Su ve İçecek","su_ve_icecek"))
          dataSet.add(Category("Sebze ","vegetable"))
          dataSet.add(Category("Fırından","bagel"))
          dataSet.add(Category("Dondurma","ice_cream"))
          dataSet.add(Category("Kahvaltılık","milk"))
          dataSet.add(Category("Yemek","food"))
          dataSet.add(Category("Kişisel Bakım","clean"))
          dataSet.add(Category("Tatlılar","sweets"))
          dataSet.add(Category("Bbek Ürünleri","diaper"))
          dataSet.add(Category("Giysiler","tshirt"))
          dataSet.add(Category("Meyveler","fruits"))
          dataSet.add(Category("Atıştırmalık","snack"))
          dataSet.add(Category("Temizlik Ürünleri","household"))
          dataSet.add(Category("Tatlılar","sweets"))
          val rv:RecyclerView=tasarim.findViewById(R.id.categoryRecycleView)
          rv.layoutManager=StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
          rv.adapter=CategoryCardAdapter(dataSet,requireContext())









        return tasarim
    }


}