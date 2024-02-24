package com.kotlincourse.recylerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.kotlincourse.R



class EmployeeAdapter(val emp: List<Emp>) : RecyclerView.Adapter<EmployeeAdapter.EmpViewHolder>() {
    class EmpViewHolder(val view: View) : ViewHolder(view){
        val tvEmpName: TextView = view.findViewById(R.id.tvEmpName)
        val tvSalary: TextView = view.findViewById(R.id.tvSalary)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmpViewHolder {
        var layoutInflater= LayoutInflater.from(parent.context)
        var view= layoutInflater.inflate(R.layout.row_employee,parent,false)
        return EmpViewHolder(view)
    }

    override fun getItemCount(): Int {
        return emp.size
    }

    override fun onBindViewHolder(holder: EmpViewHolder, position: Int) {
        var emp = emp.get(position)
        holder.tvEmpName.setText("Name : ${emp.ename}")
        holder.tvSalary.setText("Salary : ${emp.esal}")
    }
}
