package com.shubhadip.bcamate

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shubhadip.bcamate.databinding.FragmentWhatsappGroupBinding

class WhatsappGroupFragment : Fragment() {
    private  var _binding: FragmentWhatsappGroupBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWhatsappGroupBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        //  1st Whatsapp Group
        binding.wa22bca1Group.setOnClickListener {
                var url = "https://chat.whatsapp.com/DGvcyov7r7QEyzOzXgr3Hm"
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //  2nd Whatsapp Group
        binding.wa22bca2Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/FhJ4Z3AFfg9EZ1nyz4KWGh"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //  3rd Whatsapp Group
        binding.wa22bca3Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/LuhT0fLO8qt2DYVYOQDwt8"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //  4th Whatsapp Group
        binding.wa22bca4Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/BEbsGgUcPLnA0jjDqHvei1"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //  5th Whatsapp Group
        binding.wa22bca5Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/FiuR7IkYD6l2THTdfwln2j"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //  6th Whatsapp Group
        binding.wa22bca6Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/IJhDSxhEEFC0pbTd0fhB2s"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //  7th Whatsapp Group
        binding.wa22bca7Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/JM2klI1V3JCJPNPD45tY1q"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //  8th Whatsapp Group
        binding.wa22bca8Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/Cynj4GYlHUV3f87Blowo4q"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        //  9th Whatsapp Group
        binding.wa22bca9Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/EdfLb63UesSLW5EEC0Qtf1"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        //  10th Whatsapp Group
        binding.wa22bca10Group.setOnClickListener {
            var url = "https://chat.whatsapp.com/BkLwTdwkGg1JSefuG3KWHp"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        return  binding.root
    }
}