package furhatos.app.persuationfurhat.flow

import furhatos.app.persuationfurhat.nlu.NegativeAnswer
import furhatos.app.persuationfurhat.nlu.PositiveAnswer
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures
import furhatos.nlu.Intent
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes
import kotlin.random.Random


var confirmed = false

val askConfirmation: State = state(Interaction) {
    onEntry {
        furhat.ask(getRandomConfirmationQuestion())
    }

//    User agreed with the more extreme standpoint, so try to make it even more extreme
    onResponse<PositiveAnswer> {
        confirmed = true
        if (x > 4) {
            x += 1
        } else if (x < 4) {
            x -= 1
        } else if (x == 4) {
            val random = Random.nextInt(-2, 2)
            x += random
        }

        furhat.say(getRandomConfirmation())

        goto(statechecker)
    }

//    User did not agree with the more extreme standpoint, so make it less extreme
    onResponse<NegativeAnswer> {
        confirmed = false
        if (x > 4) {
            x -=  1
        } else if (x < 4) {
            x += 1
        } else if (x == 4) {
            val random = Random.nextInt(-2, 2)
            x += random
        }

        furhat.say(getRandomShowUnderstanding())
        furhat.gesture(Gestures.Smile)
        furhat.say(getFactIntroduction())


        if (x == 4) {
//            Neutral
        } else if (x > 4) {
            furhat.say(getFactMeat())
        } else {
            furhat.say(getFactAgainstMeat())
        }

        goto(statechecker)
    }
}
