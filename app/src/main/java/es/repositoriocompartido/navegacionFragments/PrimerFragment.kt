package es.repositoriocompartido.navegacionFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import es.repositoriocompartido.androidmasterviu.R
class PrimerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fgView= inflater.inflate(R.layout.fragment_primer, container, false)

        // Buscamos el componente boton
        val btnPrimer=fgView.findViewById<Button>(R.id.btnPrimer)

        //Listener
        btnPrimer.setOnClickListener {
            //safeArgs
            findNavController().navigate(
                PrimerFragmentDirections.actionPrimerFragmentToSegundoFragment(nombre="Paco")
            )
            // Este paso de fragments es sin safeArgs
            //findNavController().navigate(R.id.action_primerFragment_to_segundoFragment)
        }

        return fgView
    }

}