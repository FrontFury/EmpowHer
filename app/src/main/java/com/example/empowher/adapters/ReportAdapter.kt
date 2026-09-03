package com.example.empowher.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.empowher.R
import com.example.empowher.databinding.ItemReportBinding
import com.example.empowher.models.Report

class ReportAdapter(private val reports: List<Report>) :
    RecyclerView.Adapter<ReportAdapter.ReportViewHolder>() {

    class ReportViewHolder(val binding: ItemReportBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportViewHolder {
        val binding = ItemReportBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ReportViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReportViewHolder, position: Int) {
        val report = reports[position]
        with(holder.binding) {
            tvReportId.text = report.id
            tvCategory.text = report.category
            tvStatusBadge.text = report.status
            tvDate.text = report.date
            tvLocation.text = report.location
            tvAttachments.text = "${report.attachments} Files Attached"
            tvDescription.text = report.description
            tvCounselor.text = "Assigned Legal Counselor:\n${report.counselor}"
            tvActionLink.text = "${report.actionText} >"

            // Progression UI
            val primary = ContextCompat.getColor(holder.itemView.context, R.color.primary)
            
            // Reset all to pending/neutral
            ivStep1.setImageResource(R.drawable.ic_pending)
            ivStep2.setImageResource(R.drawable.ic_pending)
            ivStep3.setImageResource(R.drawable.ic_pending)
            ivStep4.setImageResource(R.drawable.ic_pending)

            if (report.progression >= 1) {
                ivStep1.setImageResource(R.drawable.ic_check_circle)
                ivStep1.setColorFilter(primary)
            }
            if (report.progression >= 2) {
                ivStep2.setImageResource(R.drawable.ic_review)
                ivStep2.setColorFilter(ContextCompat.getColor(holder.itemView.context, android.R.color.holo_orange_dark))
            }
            if (report.progression >= 3) {
                ivStep3.setImageResource(R.drawable.ic_action)
                ivStep3.setColorFilter(ContextCompat.getColor(holder.itemView.context, android.R.color.holo_blue_dark))
            }
            if (report.progression >= 4) {
                ivStep4.setImageResource(R.drawable.ic_check_circle)
                ivStep4.setColorFilter(ContextCompat.getColor(holder.itemView.context, android.R.color.holo_green_dark))
            }
        }
    }

    override fun getItemCount() = reports.size
}
