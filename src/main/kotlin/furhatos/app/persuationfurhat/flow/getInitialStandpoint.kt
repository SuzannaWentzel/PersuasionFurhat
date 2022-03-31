package furhatos.app.persuationfurhat.flow

import furhatos.app.persuationfurhat.nlu.*
import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.nlu.Intent
var x = 0

val GetInitialStandpoint: State = state(Interaction) {

    onEntry {
        furhat.ask("I was wondering, what do you think about eating meat?")
    }

    onResponse<StandpointNeutral> {
        furhat.say("So, you don't mind?")
        onResponse<Yes>{
            goto(statechecker)
        }
        onResponse<No>{
            x -= 1
        }
    }

    onResponse<StandpointVegetarian> {
        furhat.say("So, you rather don't eat meat?")
        onResponse<Yes> {
            x -= 1
        }
    }

    onResponse<StandpointVegan> {
        furhat.say("So, you are against eating meat?")
        onResponse<Yes> {
            x -= 2
        }
        onResponse<No>{
            x -= 1
        }
    }

    onResponse<StandpointEatMeat> {
        furhat.say("So, you eat meat?")
        onResponse<Yes> {
            x += 1
        }
        onResponse<No>{

        }
    }

    onResponse<StandpointLoveMeat> {
        furhat.say("So, you love meat?")
        onResponse<Yes> {
            x += 2
        }
        onResponse<No>{
            x += 1
        }
    }
}
