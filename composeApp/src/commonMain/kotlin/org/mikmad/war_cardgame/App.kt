package org.mikmad.war_cardgame

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.mikmad.war_cardgame.models.card.Card
import org.mikmad.war_cardgame.models.card.CardRank
import org.mikmad.war_cardgame.models.card.CardSuit
import org.mikmad.war_cardgame.ui.components.CardDisplay
import org.mikmad.war_cardgame.ui.resources.EnglishPatternCardTheme

@Composable
@Preview
fun App() {
    MaterialTheme {
        LazyColumn(
            modifier = Modifier
                .background(colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
        ) {
            val selectedTheme = EnglishPatternCardTheme

            CardSuit.entries.forEach { suit ->
                item {
                    Text(
                        text = suit.displayName,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(
                            start = 25.dp,
                            top = 25.dp,
                            end = 25.dp,
                            bottom = 8.dp
                        ),
                        fontWeight = FontWeight.Bold
                    )
                    HorizontalDivider(
                        thickness = 2.dp,
                        color = Color.Gray
                    )

                    FlowRow(
                        modifier = Modifier.padding(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        CardRank.entries.forEach { rank ->
                            val card = Card(
                                rank = rank,
                                suit = suit
                            )

                            CardDisplay(
                                card = card,
                                theme = selectedTheme
                            )
                        }
                    }
                }
            }
        }
    }
}
