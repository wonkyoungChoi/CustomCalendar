package com.example.customcalendar

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.customcalendar.databinding.ListItemDayBinding
import com.example.customcalendar.databinding.ListItemMonthBinding
import com.example.customcalendar.databinding.ListItemScheduleBinding
import java.util.*

class AdapterSchedule(private val tempMonth:Int, private val dayList: MutableList<Date>): RecyclerView.Adapter<AdapterSchedule.ScheduleView>() {
    val ROW = 6

    inner class ScheduleView(val binding: ListItemScheduleBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleView {
        val binding = ListItemScheduleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ScheduleView(binding)
    }

    override fun onBindViewHolder(holder: ScheduleView, position: Int) {
        with(holder) {
            binding.textSchedule.text ="TEST"

            binding.textSchedule.setOnClickListener {
                //TODO 스케쥴 리스트 눌렀을때 동작
            }
        }
    }

    override fun getItemCount(): Int {
        return ROW * 7
    }
}