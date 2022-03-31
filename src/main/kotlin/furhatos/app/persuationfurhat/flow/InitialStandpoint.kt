package furhatos.app.persuationfurhat.flow

import furhatos.app.persuationfurhat.nlu.*
import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.nlu.EnumEntity
import furhatos.nlu.Intent
import furhatos.util.Language

//class Fruit : EnumEntity() {
//    override fun getEnum(lang: Language): List<String> {
//        return listOf("banana": "lemon" , "orange", "apple", "pineapple", "pear")
//    }
//}
class standpoint : EnumEntity()

var x = 0
val InitialStandpointV2: State = state(Interaction) {

    onEntry {
        furhat.ask("I was wondering, what do you think about eating meat?")
    }
    onResponse<standpoint> {

        x = it.intent.value?.toInt() ?:-1
        print(x)
        goto(statechecker)
    }

}
