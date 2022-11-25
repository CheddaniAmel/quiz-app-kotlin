package com.example.quizoo

object constants_cyber {
    const val  totalquestion:String="total questions"
    const val correctanswer:String="correct answers"
    fun getquestion ():ArrayList<questions>{
        val questionslist=ArrayList<questions>()

        val ques1=questions(
            R.drawable.cyber,
            "cyber security",1,
            "Which of the following should you do to restrict access to your files and devices? ",
            "Use multi-factor authentication.",
            "Update your software once a year",
            "share passwords only with colleagues you trust",
            "none of these answers",
            1)

        val ques2=questions(
            R.drawable.cyber,
            "cyber security",2,
            "Which one of the following describes why firewalls are used? "  ,
            " To detect and disable viruses already on a computer. ",
            "To prevent unauthorised access by incoming transmissions.",//true
            "To prevent destruction of a computer in the event of a fire. ",
            "To enable easy downloading of data from web sites.",
            2)
        val ques3=questions(
            R.drawable.cyber,
            "cyber security",3,
            "Which one of the following describes why it is important to update antivirus software regularly?  ",
            "To ensure the software identifies old viruses. ",
            "To protect your computer from unwanted bulk messages. ",
            "To protect your computer from all known viruses.",//true
            "To prevent the spread of malicious programs on the Internet. ",
            3)
        val ques4=questions(
            R.drawable.cyber,
            "cyber security",3,
            "Which one of the following shows respect for the confidentiality of information? ",
            "Discussing confidential information over the telephone.",
            "Disclosing confidential information only to authorised individuals",
            " Uploading confidential information to a shared web site. ",
            "Emailing confidential information to a colleague. ",
            2)
        val ques5=questions(
            R.drawable.cyber,
            "cyber security",3,
            "Which one of the following describes why users should lock their computer when leaving their desk? ",
            "To prevent a waste of electricity.",
            "To prevent data from getting corrupted. ",
            " To prevent unauthorised access to data.",//true
            "To prevent the computer from malfunctioning. ",
            3)
        val ques6=questions(
            R.drawable.cyber,
            "cyber security",3,
            "«Which one of the following is the recommended action to prevent the risk of access to a network by other users?  ",
            "Disconnect the computer from the network.",
            "Change the default WEP or WPA access key to one that only you know.",//true
            "Complain to the System Administrator. ",
            "none of these answers",
            2)
        val ques7=questions(
            R.drawable.cyber,
            "cyber security",3,
            "Which one of the following can protect a computer from the risk of unwanted emails? ",
            "Anti-spam software. ",
            "Anti-virus software.",//true
            "Anti-spyware software",
            "PC diagnostic software",
            2)
        val ques8=questions(
            R.drawable.cyber,
            "cyber security",3,
            "Which one of the following describes how software can be stored safely?  ",
            " Storing it in a place free of magnetic fields.",
            "Storing it in a cupboard. ",
            " Storing backups of the software. ",
            " Storing it in its original packing. ",
            1)
        val ques9=questions(
            R.drawable.cyber,
            "cyber security",3,
            "Which one of the following describes why you should follow guidelines and procedures while using IT resources in an organization?  ",
            "To ensure the secure use of IT resources.",
            "To ensure the Finance Department is able to monitor the costs of IT resources. ",
            " To ensure easy access to information on your computer. ",
            " To ensure the IT Department is able to monitor all activity. ",
            1)
        val ques10=questions(
            R.drawable.cyber,
            "cyber security",3,
            "Which one of the following departments would usually hold guidelines and procedures for the secure use of IT within an organization? ",
            "The IT Department.",
            "The Marketing Department.",
            "The Sales Department.",
            "The Finance Department",
            1)

        questionslist.add(ques1)
        questionslist.add(ques2)
        questionslist.add(ques3)
        questionslist.add(ques4)
        questionslist.add(ques5)
        questionslist.add(ques6)
        questionslist.add(ques7)
        questionslist.add(ques8)
        questionslist.add(ques9)
        questionslist.add(ques10)
        return questionslist
    }
}