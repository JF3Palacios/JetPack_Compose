package juan.kotlin.helljetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import juan.kotlin.helljetpackcompose.ui.theme.HellJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            personalData(name = "Juan")
        }
    }
    @Composable
    private fun personalData(name: String){
        MaterialTheme(){
            Column(modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(R.drawable.yomismo), contentDescription = "Juan",
                    modifier = Modifier.height(200.dp) )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Mi nombre es $name", style = MaterialTheme.typography.titleMedium)
                Text(text = "Soy Programador")
                Text(text = "En Gijón")
            }
        }


    }

    @Preview
    @Composable
    fun PreviewPersonalData(){
        personalData(name = "Juan")
    }
}

