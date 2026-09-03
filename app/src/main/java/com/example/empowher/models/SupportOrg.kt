package com.example.empowher.models

data class SupportOrg(
    val id: String,
    val name: String,
    val badge: String,
    val description: String,
    val hours: String,
    val address: String,
    val iconRes: Int,
    val action1Label: String,
    val action2Label: String,
    val phoneNumber: String
)
