import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.xhaw.CART_COURSE
import com.example.xhaw.R   // Make sure to import R from your app's package
import com.example.xhaw.cart_2


class cart: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cart, container, false)

        val button = view.findViewById<Button>(R.id.button21)


        button.setOnClickListener {
            val intent = Intent(requireContext(), CART_COURSE::class.java)
            startActivity(intent)
        }


        return view
    }

    // Other fragment code...
}
