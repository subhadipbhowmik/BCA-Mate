package com.shubhadip.bcamate.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shubhadip.bcamate.databinding.FragmentBca22Sec1TimeTableBinding

class Bca22Sec1TimeTable : Fragment() {
    private  var _binding: FragmentBca22Sec1TimeTableBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBca22Sec1TimeTableBinding.inflate(inflater, container, false)


        return  binding.root
    }

}