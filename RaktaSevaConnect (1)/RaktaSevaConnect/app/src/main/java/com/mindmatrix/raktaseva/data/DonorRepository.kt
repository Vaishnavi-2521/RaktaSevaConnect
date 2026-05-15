package com.mindmatrix.raktaseva.data

import com.mindmatrix.raktaseva.model.Donor

class DonorRepository {

    fun getSampleDonors(): List<Donor> {
        return listOf(
            Donor("Rahul", "O+", "9999999999", true),
            Donor("Anjali", "A+", "8888888888", true)
        )
    }
}