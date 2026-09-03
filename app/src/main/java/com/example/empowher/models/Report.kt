package com.example.empowher.models

data class Report(
    val id: String,
    val category: String,
    val status: String,
    val date: String,
    val location: String,
    val attachments: Int,
    val description: String,
    val progression: Int, // 1 to 4
    val counselor: String,
    val actionText: String
)
