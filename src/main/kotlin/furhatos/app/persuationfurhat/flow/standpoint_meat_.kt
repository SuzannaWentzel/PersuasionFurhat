package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import standpoint_meat1_options
import standpoint_meat2_options
import standpoint_meat3_options
import standpoint_meat4_options
import kotlin.random.Random

val standpoint_meat1: State = state(Interaction) {

    onEntry {
            val random = Random.nextInt(0, standpoint_meat1_options.size)
            furhat.gesture(Gestures.Blink)
            furhat.say(standpoint_meat1_options[random])
            standpoint_meat1_options.removeAt(random)
            goto(askConfirmation)
    }
}

val standpoint_meat2: State = state(Interaction) {

    onEntry {
            val random = Random.nextInt(0, standpoint_meat2_options.size)
            furhat.gesture(Gestures.BrowFrown)
            furhat.say(standpoint_meat2_options[random])
            standpoint_meat2_options.removeAt(random)
            goto(askConfirmation)
    }
}

val standpoint_meat3: State = state(Interaction) {

    onEntry {
            val random = Random.nextInt(0, standpoint_meat3_options.size)
            furhat.gesture(Gestures.ExpressDisgust(duration=2.0, strength = 0.5))
            furhat.say(standpoint_meat3_options[random])
            standpoint_meat3_options.removeAt(random)
            goto(askConfirmation)
    }
}

val standpoint_meat4: State = state(Interaction) {

    onEntry {
            val random = Random.nextInt(0, standpoint_meat4_options.size)
            furhat.gesture(Gestures.ExpressAnger(duration=2.0, strength = 0.5))
            furhat.say(standpoint_meat4_options[random])
            standpoint_meat4_options.removeAt(random)
            goto(askConfirmation)
    }
}
