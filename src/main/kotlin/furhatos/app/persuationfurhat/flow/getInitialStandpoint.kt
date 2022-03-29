package furhatos.app.persuationfurhat.flow

import furhatos.app.persuationfurhat.nlu.*
import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.nlu.Intent

val GetInitialStandpoint: State = state(Interaction) {
    onEntry {
        furhat.ask("I was wondering, what do you think about eating meat?")
    }

    onResponse<StandpointNeutral> {
        furhat.say("So, you don't mind?")
    }

    onResponse<StandpointVegetarian> {
        furhat.say("So, you rather don't eat meat?")
    }

    onResponse<StandpointVegan> {
        furhat.say("So, you are against eating meat?")
    }

    onResponse<StandpointEatMeat> {
        furhat.say("So, you eat meat?")
    }

    onResponse<StandpointLoveMeat> {
        furhat.say("So, you love meat?")
    }
}
