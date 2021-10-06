package com.example.json


import com.google.gson.annotations.SerializedName

class BookDetails {// add details of book


    @SerializedName("data")
    var data: List<Datum>? = null

    class Datum {
        @SerializedName("id")
        var id: Int? = null

        @SerializedName("name")
        var name: String? = null

        @SerializedName("year")
        var year: Int? = null

        @SerializedName("pantone_value")
        var pantoneValue: String? = null
    }
}