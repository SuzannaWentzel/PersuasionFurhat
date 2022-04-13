package furhatos.app.persuationfurhat.flow

import furhatos.app.persuationfurhat.nlu.NegativeAnswer
import furhatos.app.persuationfurhat.nlu.PositiveAnswer
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import furhatos.nlu.Intent
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes
import kotlin.random.Random


var confirmed = false

val askConfirmation: State = state(dialogState) {
    onEntry {
        furhat.gesture(Gestures.Blink)
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

        furhat.gesture(Gestures.Smile(duration=3.0))
        furhat.say(getRandomConfirmation())

        if (optionsIsEmpty()) {
            goto(ending)
        }
        else if (x>8 || x<0){
            goto(ending)
        }

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
        furhat.gesture(random(Gestures.Oh(duration = 2.0), Gestures.Shake(duration = 2.0)))
        furhat.say(getRandomShowUnderstanding())

        if (optionsIsEmpty()) {
            goto(ending)
        }

        furhat.gesture(Gestures.Smile(duration = 2.0))
        furhat.say(getRandomFactIntroduction())
        furhat.gesture(Gestures.GazeAway(duration = 2.0))

        if (x == 4) {
            furhat.say(getRandomFactNeutral())
        } else if (x > 4) {
            furhat.say(getRandomFactMeat())
        } else {
            furhat.say(getRandomFactAgainstMeat())
        }
        furhat.gesture(Gestures.Thoughtful(duration = 2.0))
        furhat.say(getRandomCopulative())

        goto(statechecker)
    }
    onResponse<Question> {
        
    }
}
