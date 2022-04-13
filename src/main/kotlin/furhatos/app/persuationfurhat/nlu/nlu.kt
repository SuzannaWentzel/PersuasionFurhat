package furhatos.app.persuationfurhat.nlu

import furhatos.nlu.Intent
import furhatos.util.Language
import LastQuestion

//class Greetings: Intent() {
//    override fun getExamples(lang: Language): List<String> {
//        return listOf("hey", "hi", "hello", "hello there", "hi there")
//    }
//}

class Greetings: Intent()
class StandpointLoveMeat: Intent()
class StandpointEatMeat: Intent()
class StandpointNeutral: Intent()
//class StandpointVegetarian: Intent() {
//    override fun getExamples(lang: Language): List<String> {
//        return listOf("vegetarian")
//    }
//}
class StandpointVegetarian: Intent()
class StandpointVegan: Intent()
class PositiveAnswer : Intent()
class NegativeAnswer : Intent()
class Opinion : Intent()
class Question : Intent()