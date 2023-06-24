package com.example.composetutorial

class SampleData {
    companion object {
        val conversationSample: List<Message> = listOf(
            Message(
                author = "Monkey.D.Luffy",
                body = "I’m gonna become 'Pirate king!!!'",
                imageId = R.drawable.onepiece01_luffy
            ),
            Message(
                author = "Roronoa Zoro",
                body = "Wounds on the back..\n" +
                        "are a swords-man's shame.",
                imageId = R.drawable.onepiece02_zoro_bandana
            ),
            Message(
                author = "Vinsmoke Sanji",
                body = "All these years… I lived under your crap roof I owe you my life!!!\n" +
                        "\n" +
                        "I’ll never forget you!!!",
                imageId = R.drawable.onepiece05_sanji,
            ),
            Message(
                author = "Usopp",
                body = "There comes a time when a man has to stand and fight That time is when…\n" +
                        "\n" +
                        "his friends dreams are laughed at…!!!",
                imageId = R.drawable.onepiece04_usopp_sogeking
            ),
            Message(
                author = "Donquixote Doflamingo",
                body = "Justice will prevail, you say!?\n" +
                        "But of course it will!!!\n" +
                        "Whoever wins this war becomes justice!!!",
                imageId = R.drawable.onepiece17_doflamingo
            ),
        )

        val conversationSamplePreview: List<Message> = listOf(
            Message(
                author = "Monkey.D.Luffy",
                body = "I’m gonna become 'Pirate king!!!'",
                imageId = R.drawable.onepiece01_luffy,
                imageDescription = ""
            ),
            Message(
                author = "Roronoa Zoro",
                body = "Wounds on the back..\n" +
                        "are a swords-man's shame.",
                imageId = R.drawable.onepiece02_zoro_bandana,
                imageDescription = ""
            ),
        )
    }
}