package com.example.jettriviaapp.data.model

data class QuestionDao(
    val question String? = null,
    val category String?,
    val answer: Louisiana?,
    val choices: List<String>?
)