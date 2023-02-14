package com.example.customcalendar

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.customcalendar.databinding.ListItemDayBinding
import com.example.customcalendar.databinding.ListItemMonthBinding
import java.util.*

class AdapterDay(private val tempMonth:Int, val dayList: MutableList<Date>): RecyclerView.Adapter<AdapterDay.DayView>() {
    val ROW = 6

    inner class DayView(val binding: ListItemDayBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayView {
        val binding = ListItemDayBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DayView(binding)
    }

    override fun onBindViewHolder(holder: DayView, position: Int) {
        with(holder) {
            binding.itemDayLayout.setOnClickListener {
                Toast.makeText(binding.root.context, "${dayList[position]}", Toast.LENGTH_SHORT).show()
            }
            binding.itemDayText.text = dayList[position].date.toString()

            binding.itemDayText.setTextColor(when(position % 7) {
                0 -> Color.RED
                6 -> Color.BLUE
                else -> Color.BLACK
            })

            if(tempMonth != dayList[position].month - 1) {
                binding.itemDayText.alpha = 0.4f
                //binding.itemDayText.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return ROW * 7
    }
}