package com.android.redo.criminalintent

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class CrimeListFragment: Fragment() {
    private val crimeListViewModel: CrimeListViewModel by lazy {
        ViewModelProvider(this).get(CrimeListViewModel::class.java)
    }

    companion object {
        fun newInstance(): CrimeListFragment {
            return CrimeListFragment()
        }
    }
}