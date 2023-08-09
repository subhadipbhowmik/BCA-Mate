package com.shubhadip.bcamate

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.shubhadip.bcamate.databinding.FragmentComputerNetworkChaptersBinding

class ComputerNetworkChaptersFragment : Fragment() {
    private  var _binding: FragmentComputerNetworkChaptersBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentComputerNetworkChaptersBinding.inflate(inflater, container, false)

      //   unit_01_topic_01

        binding.cnTopic111Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1-1TRpIJXN4qOTFPV-Xsokx0RE-4hj6Va/view?usp=drive_link"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }


        return  binding.root
    }

}