// Copyright 2017 Pierre Talbot (IRCAM)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//   http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package game;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;




public class Game {

  private static final String PATH_TO_DECK = System.getProperty("user.dir")+"\\data\\deck\\";

  public Player getP1() {
    return p1;
  }

  private Player p1 = new Player("Player 1");


  public void getJsonDeck(){
    for (final File fileEntry : new File(PATH_TO_DECK).listFiles()) {
      if (!fileEntry.isDirectory()) {
        Gson gson = new Gson();
        try {
          Deck deck = gson.fromJson(new FileReader(PATH_TO_DECK+fileEntry.getName()), Deck.class);
          p1.add_deck(deck);
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }

      }
    }
  }
}
