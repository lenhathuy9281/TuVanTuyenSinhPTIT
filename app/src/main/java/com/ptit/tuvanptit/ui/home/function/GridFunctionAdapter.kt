package com.ptit.tuvanptit.ui.home.function

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ptit.tuvanptit.databinding.ItemFunctionHomeBinding


class GridFunctionAdapter(recyclerDataArrayList: List<FunctionData>) :
    RecyclerView.Adapter<GridFunctionAdapter.RecyclerViewHolder>() {
    private val courseDataArrayList: ArrayList<FunctionData>

    init {
        courseDataArrayList = ArrayList(recyclerDataArrayList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val binding = ItemFunctionHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val recyclerData: FunctionData = courseDataArrayList[position]
        holder.bind(recyclerData)
    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return courseDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(private val binding: ItemFunctionHomeBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: FunctionData) {
            with(binding) {
                tvFunctionName.text = item.title
            }
        }
    }
}
