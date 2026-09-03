package com.example.empowher.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.empowher.databinding.ItemSupportOrgBinding
import com.example.empowher.models.SupportOrg

class SupportOrgAdapter(private val orgs: List<SupportOrg>) :
    RecyclerView.Adapter<SupportOrgAdapter.SupportOrgViewHolder>() {

    class SupportOrgViewHolder(val binding: ItemSupportOrgBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SupportOrgViewHolder {
        val binding = ItemSupportOrgBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SupportOrgViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SupportOrgViewHolder, position: Int) {
        val org = orgs[position]
        holder.binding.tvOrgName.text = org.name
        holder.binding.tvOrgBadge.text = org.badge
        holder.binding.tvOrgDesc.text = org.description
        holder.binding.tvOrgHours.text = org.hours
        holder.binding.tvOrgAddress.text = org.address
        holder.binding.ivOrgIcon.setImageResource(org.iconRes)
        holder.binding.btnAction1.text = org.action1Label
        holder.binding.btnAction2.text = org.action2Label

        // Set icons based on labels
        if (org.action1Label == "Website") {
            holder.binding.btnAction1.setIconResource(com.example.empowher.R.drawable.ic_group)
        } else if (org.action1Label == "Directions") {
            holder.binding.btnAction1.setIconResource(com.example.empowher.R.drawable.ic_location)
        } else if (org.action1Label == "Find District Office") {
            holder.binding.btnAction1.setIconResource(com.example.empowher.R.drawable.ic_search)
        }
    }

    override fun getItemCount() = orgs.size
}
