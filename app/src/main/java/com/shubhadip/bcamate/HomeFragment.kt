package com.shubhadip.bcamate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.shubhadip.bcamate.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private  var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

       //   all button actions

     //  first sem btn

        binding.notes1stSemBtn.setOnClickListener {
            val notes1stSemSubjectsFragment = FirstSemSubjectsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, notes1stSemSubjectsFragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        //  second sem btn

        binding.notes2ndSemBtn.setOnClickListener {
            val notes2ndSemSubjectsFragment = SecondSemSubjectsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, notes2ndSemSubjectsFragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }


       //   third sem button
        binding.notes3rdSemBtn.setOnClickListener {
            val notes3rdSemSubjectsFragment = ThirdSemSubjectsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, notes3rdSemSubjectsFragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        //  fourth sem btn

        binding.notes4thSemBtn.setOnClickListener {
            val notes4thSemSubjectsFragment = FourthSemSubjectsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, notes4thSemSubjectsFragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        //  fifth sem btn

        binding.notes5thSemBtn.setOnClickListener {
            val notes5thSemSubjectsFragment = FifthSemSubjectsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, notes5thSemSubjectsFragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }
        //  sixth sem btn

        binding.notes6thSemBtn.setOnClickListener {
            val notes6thSemSubjectsFragment = SixthSemSubjectsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, notes6thSemSubjectsFragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }


        return  binding.root

    }
}