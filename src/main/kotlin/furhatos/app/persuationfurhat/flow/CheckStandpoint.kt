package furhatos.app.persuationfurhat.flow

import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

var confirmed = false

val askConfirmation: State = state(Interaction) {
    onEntry {
        furhat.ask(getRandomConfirmationQuestion())
    }

//    User agreed with the more extreme standpoint, so try to make it even more extreme
    onResponse<Yes> {
        confirmed = true
        if (x > 4) {
            x += 1
        } else if (x < 4) {
            x -= 1
        } else if (x == 4) {
//            randomly go up or down
        }

        furhat.say(getRandomConfirmation())

        goto(statechecker)
    }

//    User did not agree with the more extreme standpoint, so make it less extreme
    onResponse<No> {
        confirmed = false
        if (x > 4) {
            x -=  1
        } else if (x < 4) {
            x += 1
        } else if (x == 4) {
//            randomly go up or down
        }

        furhat.say(getRandomShowUnderstanding())
        furhat.say(getFactIntroduction())

        if (x == 4) {
//            Neutral
        } else if (x > 4) {
//            Meat
        } else {
//            No meat
        }

        goto(statechecker)
    }
}
