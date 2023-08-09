package com.shubhadip.bcamate

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shubhadip.bcamate.databinding.FragmentCrBinding

class CrFragment : Fragment() {

    private  var _binding: FragmentCrBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCrBinding.inflate(inflater, container, false)
        
        //  first cr calling
          binding.cr1CallBtn.setOnClickListener {
              val intent = Intent(Intent.ACTION_DIAL)
              intent.data = Uri.parse("tel:" + "+91 7004974101")
              startActivity(intent)
          }

        //  2 cr calling

        binding.cr2CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 6239412024")
            startActivity(intent)
        }

        //  3 cr calling
        binding.cr3CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7827739709")
            startActivity(intent)
        }

        //  4 cr calling
        binding.cr4CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7455965711")
            startActivity(intent)
        }

        //  5 cr calling
        binding.cr5CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9457085369")
            startActivity(intent)
        }

        //  6 cr calling
        binding.cr6CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 8950128571")
            startActivity(intent)
        }

        //  7 cr calling
        binding.cr7CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7078570981")
            startActivity(intent)
        }

        //  8 cr calling
        binding.cr8CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9915368820")
            startActivity(intent)
        }

        //  9 cr calling
        binding.cr9CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7973308065")
            startActivity(intent)
        }

        //  10 cr calling
        binding.cr10CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 8171924503")
            startActivity(intent)
        }

        //  11 cr calling
        binding.cr11CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9588706663")
            startActivity(intent)
        }

        //  12 cr calling
        binding.cr12CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 6299766409")
            startActivity(intent)
        }

        //  13 cr calling
        binding.cr13CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 8059213353")
            startActivity(intent)
        }

        //  14 cr calling
        binding.cr14CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9815094384")
            startActivity(intent)
        }

        //  15 cr calling
        binding.cr15CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 8847521352")
            startActivity(intent)
        }

        //  16 cr calling
        binding.cr16CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 198")
            startActivity(intent)
        }

        //  17 cr calling
        binding.cr17CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 8950088797")
            startActivity(intent)
        }

        //  18 cr calling
        binding.cr18CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7876129239")
            startActivity(intent)
        }

        //  19 cr calling
        binding.cr19CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7717602358")
            startActivity(intent)
        }

        //  20 cr calling
        binding.cr20CallBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9510694244")
            startActivity(intent)
        }

        return  binding.root
    }


}