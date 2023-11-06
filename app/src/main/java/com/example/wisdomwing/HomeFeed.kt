import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class HomeFeedActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: QuestionsAdapter
    private lateinit var database: FirebaseDatabase
    private lateinit var questionsReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_feed)

        // Initialize Firebase
        database = FirebaseDatabase.getInstance()
        questionsReference = database.reference.child("questions")

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewQuestions)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = QuestionsAdapter()
        recyclerView.adapter = adapter

        // Set up Firebase ValueEventListener to retrieve questions
        questionsReference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val questions = mutableListOf<Question>()
                for (questionSnapshot in dataSnapshot.children) {
                    val question = questionSnapshot.getValue(Question::class.java)
                    questions.add(question!!)
                }
                adapter.updateQuestions(questions)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Handle any errors
            }
        })

        // Set click listeners for navigation buttons
        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnAskDoubt = findViewById<Button>(R.id.btnAskDoubt)
        val btnDashboard = findViewById<Button>(R.id.btnDashboard)

        btnHome.setOnClickListener {
            // Handle Home button click (e.g., go to the home page)
        }

        btnAskDoubt.setOnClickListener {
            // Handle Ask Doubt button click (e.g., go to the ask doubt page)
        }

        btnDashboard.setOnClickListener {
            // Handle Dashboard button click (e.g., go to the user dashboard page)
        }
    }
}
