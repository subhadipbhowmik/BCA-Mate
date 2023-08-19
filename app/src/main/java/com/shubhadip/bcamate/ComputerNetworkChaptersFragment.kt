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

        // 1.1.1
        binding.cnTopic111Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1-1TRpIJXN4qOTFPV-Xsokx0RE-4hj6Va/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.1.2
        binding.cnTopic112Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1OTWKGDiL-1A_MjGOc6GgfO4R6Wu_vkBW/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.1.3
        binding.cnTopic113Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1-XVta3oY1sGc3r9mz7yDX7yRiHiVnGWx/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.1.4
        binding.cnTopic114Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1XGAU_CJdXwRetG9XtbQ3RT0nd5BG_H8E/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.1.5
        binding.cnTopic115Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1xqt0-js15qnl2sncIKwHzmwSyWtz5Pwb/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.1.6
        binding.cnTopic116Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1YtYeqjLD-6UAiqNdWlJ56RT15ygfrUtl/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.1.7
        binding.cnTopic117Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1eRuF6dxt4hgW2ZeDctU1D2JU9v0sidlF/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.2.1
        binding.cnTopic121Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1Jff7Bv3rtrBzaA7gD5qpsjCTEhZQs8wv/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.2.2
        binding.cnTopic122Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/13pt8-Gb7Dzk4yo38IvW_ao2YxQsZaQv6/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.2.3
        binding.cnTopic123Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1NTw7JgKZM0bzvxPW_L9EoJk0owpP2PQy/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.2.4
        binding.cnTopic124Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1WOBzWk_bYRqLWbnp4u9IKeg4fGaJq6Aq/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.2.5
        binding.cnTopic125Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1Y_0fWDQvYJhM-v7DdY-T5lDtATN4m1Xp/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.3.1
        binding.cnTopic131Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1Q3gzbnGOSMrCXiaigqhnLCuy1B8PaLUb/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.3.2
        binding.cnTopic132Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1vtFx7lcC_CkgCnrCAIpFL230hWHfLZbt/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }

        // 1.3.3
        binding.cnTopic133Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Opening PDF", Toast.LENGTH_SHORT).show()

            var driveUrl = "https://drive.google.com/file/d/1bpknApzNglm_80PktR9BFRZxgextQJ5W/view"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(driveUrl)))
        }


        return  binding.root
    }

}