package com.shubhadip.bcamate

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shubhadip.bcamate.databinding.FragmentMentorBinding

class MentorFragment : Fragment() {

    private  var _binding: FragmentMentorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMentorBinding.inflate(inflater, container, false)

       //  mentor 1 call to actions

        binding.callMentor1Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7700070360")
            startActivity(intent)
        }

        binding.waMentor1Btn.setOnClickListener {
            var url = "https://wa.me/917700070360"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor1Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:sachin.e15485@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 2 call to actions

        binding.callMentor2Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 8295973330")
            startActivity(intent)
        }

        binding.waMentor2Btn.setOnClickListener {
            var url = "https://wa.me/918295973330"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor2Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:arvinder.e14806@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 3 call to actions

        binding.callMentor3Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9478156796")
            startActivity(intent)
        }

        binding.waMentor3Btn.setOnClickListener {
            var url = "https://wa.me/919478156796"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor3Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:harneet.e14114@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 4 call to actions

        binding.callMentor4Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9050456871")
            startActivity(intent)
        }

        binding.waMentor4Btn.setOnClickListener {
            var url = "https://wa.me/919050456871"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor4Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:rashmi.e15747@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 5 call to actions

        binding.callMentor5Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9517106597")
            startActivity(intent)
        }

        binding.waMentor5Btn.setOnClickListener {
            var url = "https://wa.me/919517106597"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor5Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:konika.E13199@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 6 call to actions

        binding.callMentor6Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9007466285")
            startActivity(intent)
        }

        binding.waMentor6Btn.setOnClickListener {
            var url = "https://wa.me/919007466285"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor6Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:sharmistha.e12828@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 7 call to actions

        binding.callMentor7Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7307162676")
            startActivity(intent)
        }

        binding.waMentor7Btn.setOnClickListener {
            var url = "https://wa.me/917307162676"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor7Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:sushma.e13049@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here


        //  mentor 8 call to actions

        binding.callMentor8Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9056664129")
            startActivity(intent)
        }

        binding.waMentor8Btn.setOnClickListener {
            var url = "https://wa.me/919056664129"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor8Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:ruchika.e14123@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 9 call to actions

        binding.callMentor9Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9138187216")
            startActivity(intent)
        }

        binding.waMentor9Btn.setOnClickListener {
            var url = "https://wa.me/919138187216"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor9Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:jyoti.e14005@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here


        //  mentor 10 call to actions

        binding.callMentor10Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7837761101")
            startActivity(intent)
        }

        binding.waMentor10Btn.setOnClickListener {
            var url = "https://wa.me/917837761101"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor10Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:gurpreet.e14273@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 11 call to actions

        binding.callMentor11Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 6284176113")
            startActivity(intent)
        }

        binding.waMentor11Btn.setOnClickListener {
            var url = "https://wa.me/916284176113"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor11Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:simran.e15463@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here


        //  mentor 12 call to actions

        binding.callMentor12Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 8288099373")
            startActivity(intent)
        }

        binding.waMentor12Btn.setOnClickListener {
            var url = "https://wa.me/918288099373"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor12Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:kanchan.e13608@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here


        //  mentor 13 call to actions

        binding.callMentor13Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9417169369")
            startActivity(intent)
        }

        binding.waMentor13Btn.setOnClickListener {
            var url = "https://wa.me/919914441038"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor13Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:sanjay.e13150@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 14 call to actions

        binding.callMentor14Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9914441038")
            startActivity(intent)
        }

        binding.waMentor14Btn.setOnClickListener {
            var url = "https://wa.me/919914441038"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor14Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:harleen.e15148@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 15 call to actions

        binding.callMentor15Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9988646838")
            startActivity(intent)
        }

        binding.waMentor15Btn.setOnClickListener {
            var url = "https://wa.me/919988646838"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor15Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:preeti.e8780@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 16 call to actions

        binding.callMentor16Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7780960007")
            startActivity(intent)
        }

        binding.waMentor16Btn.setOnClickListener {
            var url = "https://wa.me/917780960007"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor16Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:mohsin.e14682@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 17 call to actions

        binding.callMentor17Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 9988990258")
            startActivity(intent)
        }

        binding.waMentor17Btn.setOnClickListener {
            var url = "https://wa.me/919988990258"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor17Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:ramandeep.e12062@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here


        //  mentor 18 call to actions

        binding.callMentor18Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7889360515")
            startActivity(intent)
        }

        binding.waMentor18Btn.setOnClickListener {
            var url = "https://wa.me/917889360515"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor18Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:Arshid.e15587@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here


        //  mentor 19 call to actions

        binding.callMentor19Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7889377586")
            startActivity(intent)
        }

        binding.waMentor19Btn.setOnClickListener {
            var url = "https://wa.me/917889377586"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor19Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:arvind.e15026@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here

        //  mentor 20 call to actions

        binding.callMentor20Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7986967679")
            startActivity(intent)
        }

        binding.waMentor20Btn.setOnClickListener {
            var url = "https://wa.me/917986967679"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        binding.mailMentor20Btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse(
                "mailto:jyoti.e11736@cumail.in"
            )
            intent.data = data
            startActivity(intent)
        }

        //  mentor ends here



        return  binding.root
    }
}