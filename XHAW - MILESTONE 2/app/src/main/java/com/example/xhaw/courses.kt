import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.xhaw.R   // Make sure to import R from your app's package
import com.example.xhaw.monthlycourse
import com.example.xhaw.weeklycourse

class courses: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_courses, container, false)

        val button6 = view.findViewById<Button>(R.id.button6)
        val button7 = view.findViewById<Button>(R.id.button7)

        button6.setOnClickListener {
            val intent = Intent(requireContext(), weeklycourse::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(requireContext(), monthlycourse::class.java)
            startActivity(intent)
        }

        return view
    }

    // Other fragment code...
}
