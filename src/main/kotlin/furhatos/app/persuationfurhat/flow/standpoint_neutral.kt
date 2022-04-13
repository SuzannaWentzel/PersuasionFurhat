package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import standpoint_neutral_options
import kotlin.random.Random

val standpoint_neutral: State = state(dialogState) {

    onEntry {
            val random = Random.nextInt(0, standpoint_neutral_options.size)
            furhat.say(standpoint_neutral_options[random])
            standpoint_neutral_options.removeAt(random)
            goto(askConfirmation)
    }

}

