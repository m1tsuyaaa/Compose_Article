package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun ArticleImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.bg_compose_background),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun ArticleText(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = stringResource(R.string.article_title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.article_paragraph_1),
            fontSize = 14.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.article_paragraph_2),
            fontSize = 14.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeArticle(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        ArticleImage()
        ArticleText()
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        ComposeArticle()
    }
}