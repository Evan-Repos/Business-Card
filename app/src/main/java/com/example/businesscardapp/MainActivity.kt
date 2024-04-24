package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardLayout(
                        titleText = stringResource(R.string.title_text),
                        professionText = stringResource(R.string.profession_text),
                        image = painterResource(id = R.drawable.android_batman_logo_2),
                        phoneNo = stringResource(R.string.phone_id),
                        gitHub = stringResource(R.string.github_id),
                        emailId = stringResource(R.string.email_id),
                    )
                }
            }
        }
    }
}

@Composable
fun CardLayout(titleText: String,
               professionText: String,
               image: Painter,
               phoneNo: String,
               gitHub: String,
               emailId: String,
               modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBDC1FE)),
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .size(250.dp)

        )
        Text(
            text = titleText,
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = modifier
                .padding(top = 12.dp)
                .padding(bottom = 12.dp)
        )
        Text(
            text = professionText,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = modifier
        )
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)

    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.call_icon),
                contentDescription = null,
                modifier = Modifier
                    .size(22.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = phoneNo,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = Color.Black
            )
        }
            Spacer(modifier = Modifier.height(8.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.github_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = gitHub,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                Image(
                    painter = painterResource(id = R.drawable.email_icon),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = emailId,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
            }
    }
}

@Preview(showBackground = true)
@Composable
fun CardLayoutPreview() {
    BusinessCardAppTheme {
        CardLayout(
            titleText = stringResource(R.string.title_text),
            professionText = stringResource(R.string.profession_text),
            image = painterResource(id = R.drawable.android_batman_logo_2),
            phoneNo = stringResource(R.string.phone_id),
            gitHub = stringResource(R.string.github_id),
            emailId = stringResource(R.string.email_id),
        )
    }
}
