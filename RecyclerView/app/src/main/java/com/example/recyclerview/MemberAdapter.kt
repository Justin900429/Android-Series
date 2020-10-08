package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.member_layout.view.*

class MemberAdapter (
    private var members: MutableList<MemberInfo>
) : RecyclerView.Adapter<MemberAdapter.MemberViewHolder>()  {
    // Our ViewHolder
    class MemberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : MemberViewHolder {
        // Make our view look like member_layout.xml
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.member_layout, parent, false)

        // Return ViewHolder
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        // Bind the layout view to the data
        holder.itemView.apply {
            // Name to name
            txt_name.text = members[position].name
            // Age to age
            txt_age.text = members[position].age.toString()

            // button listener
            btn_remove.setOnClickListener {
                members.removeAt(position)
                notifyItemRemoved(position)
            }
        }
    }

    override fun getItemCount(): Int {
        // Return the size of mutableList
        return members.size
    }
}