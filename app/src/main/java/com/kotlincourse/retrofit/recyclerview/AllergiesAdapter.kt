package com.kotlincourse.retrofit.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlincourse.R
import com.kotlincourse.recylerview.EmployeeAdapter
import com.kotlincourse.retrofit.Allergies
import com.kotlincourse.retrofit.MyData
//allergies -> 19 Records => List<Allergies>
//allergies : [{"id":"2","allergy_name":"Soy"},{"id":"3","allergy_name":"Nut"},{"id":"4","allergy_name":"Glutaraldehyde"},{"id":"5","allergy_name":"Cows milk"},{"id":"6","allergy_name":"Shellfish"},{"id":"7","allergy_name":"Tomato"},{"id":"8","allergy_name":"Wheat"},{"id":"9","allergy_name":"Testing"},{"id":"12","allergy_name":"Corn"},{"id":"14","allergy_name":"Testing 10"},{"id":"15","allergy_name":"Crab"},{"id":"16","allergy_name":"12345"},{"id":"17","allergy_name":"great"},{"id":"18","allergy_name":"millet"},{"id":"19","allergy_name":"jelepeno"},{"id":"20","allergy_name":"salt"},{"id":"21","allergy_name":"egg"},{"id":"22","allergy_name":"cauliflower"},{"id":"23","allergy_name":"Omkar"}]
class AllergiesAdapter constructor(val allergies: List<Allergies>) : RecyclerView.Adapter<AllergiesAdapter.AllegiesViewHolder>() {
    class AllegiesViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val tvID: TextView = view.findViewById(R.id.tvID)
        val tvAllergyName: TextView = view.findViewById(R.id.tvAllergyName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllegiesViewHolder {
        var layoutInflater= LayoutInflater.from(parent.context)
        var view= layoutInflater.inflate(R.layout.row_allergis,parent,false)
        return AllegiesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return allergies.size
    }

    override fun onBindViewHolder(holder: AllegiesViewHolder, position: Int) { //position = 0, position = 1, position =2, position = 3 position = 18
        //Data getting
        var allergy = allergies.get(position) //allergy => {"id":"2","allergy_name":"Soy"}
         //Ui data setting
        holder.tvID.text = "AID : ${allergy.id}"
        holder.tvAllergyName.text ="Allergy : ${allergy.allergy_name}"
    }
}