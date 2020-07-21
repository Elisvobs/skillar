package com.elisvobs.skillar.util;

import com.elisvobs.skillar.R;
import com.elisvobs.skillar.model.Note;
import com.elisvobs.skillar.model.Skill;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    List<Skill> mSkills = new ArrayList<>();
    List<Note> mNotes = new ArrayList<>();

    public static DataManager getInstance() {
        DataManager ourInstance = new DataManager();

        ourInstance.initializeSkills();
        ourInstance.initializeGoalNotes();

        return ourInstance;
    }

    public List<Skill> getSkills() {
        return mSkills;
    }

    public List<Note> getNotes() {
        return mNotes;
    }

    private void initializeSkills() {
        mSkills.add(new Skill(R.string.skills, R.drawable.creative));
        mSkills.add(new Skill(R.string.goals, R.drawable.goal));
        mSkills.add(new Skill(R.string.problem, R.drawable.prob));
        mSkills.add(new Skill(R.string.creative, R.drawable.creat));
        mSkills.add(new Skill(R.string.leadership, R.drawable.lead));
        mSkills.add(new Skill(R.string.communications, R.drawable.neg));
        mSkills.add(new Skill(R.string.assertiveness, R.drawable.asserts));
        mSkills.add(new Skill(R.string.conflict, R.drawable.confl));
        mSkills.add(new Skill(R.string.team, R.drawable.teamw));
        mSkills.add(new Skill(R.string.stress, R.drawable.stressman));
        mSkills.add(new Skill(R.string.awareness, R.drawable.aware));
        mSkills.add(new Skill(R.string.esteem, R.drawable.awar));
        mSkills.add(new Skill(R.string.negotiation, R.drawable.nego));
        mSkills.add(new Skill(R.string.time, R.drawable.timems));
        mSkills.add(new Skill(R.string.decision, R.drawable.decs));
        mSkills.add(new Skill(R.string.relationships, R.drawable.relas));
        mSkills.add(new Skill(R.string.pressure, R.drawable.peers));
        mSkills.add(new Skill(R.string.substance, R.drawable.subs));
//        skills.add(new Skill(R.string.critical, R.drawable.ic_menu_send));
    }

    private void initializeGoalNotes() {
        mNotes.add(new Note("", ""));
        mNotes.add(new Note("Find direction. Live your life your way", "Goal setting is a powerful process for thinking about your ideal future, and for motivating yourself to turn this vision of the future into reality. The process of setting goals helps you choose where you want to go in life. By knowing precisely what you want to achieve, you know where you have to concentrate your efforts. You will also quickly spot the distractions that would otherwise detract you from you course.\n" +
                "\n Properly-set goals can be incredibly motivating and as you get into the habit of setting and achieving your goals, you will find that your self-confidence improves\n"));
        mNotes.add(new Note("Achieving more with focus", "Top-level athletes, successful business-people and achievers in all fields use goal-setting techniques. They give you long-term vision and short-term motivation. They focus your acquisition of knowledge and help you to organize your time and your resources so that you can make the very most of your life.\n" +
                "\n By setting sharp, clearly defined goals, you can measure and take pride in the achievement of those goals. You can see forward progress in what might previously have seemed a long pointless grind. By setting goals, you will also raise your self-confidence, as you recognize your ability and competence in achieving the goals that you have set.\n"));
        mNotes.add(new Note("Starting to set personal goals", "Goals are set on a number of different levels:\n" +
                "1.\tCreate your “big picture” of what you want to do with \byour life and decide what large-scale goals you want to  \bachieve.\n" +
                "2.\tThen you break these down into smaller and smaller \btargets that you must hit so that you reach your lifetime \bgoals.\n" +
                "3.\tFinally, once you have your plan, you start working to \bachieve it.\n" +
                "\n We start this process with your Lifetime Goals, and work down to the things you can do today to start moving towards them.\n"));
        mNotes.add(new Note("Starting to achieve your lifetime goals", "Once you have set your lifetime goals, set a 25-year plan of smaller goals that you should complete if you are to reach your lifetime plan. Then set a 5-year plan, 1-year plan, 6-month plan and 1-month plan of progressively smaller goals that you should reach to achieve your lifetime goals. Each of these should be based on the previous plan.\n" +
                "\n Then create a daily to-do list of things that you should do today to work towards your lifetime goals. At an early stage of these goals, may be to read books and gather information on the achievement of your goals. This will help you to improve the quality and realism of your goal setting. Finally review your plans, and make sure that they fit the way in which you want to live your life.\n"));
        mNotes.add(new Note("Staying on course", "Once you have decided your first set of plans, keep the process going by reviewing and updating your to-do list on a daily basis. Periodically review the longer-term plans, and modify them to reflect your changing priorities and experiences."));
        mNotes.add(new Note("Achieving Goals", "When you have achieved a goal, take time to enjoy the satisfaction of having done so. Absorb the implications of the goal achievement, and observe the progress you have made towards other goals. If the goal was a significant one, reward yourself appropriately. All of this helps you build the self-confidence you deserve!\n" +
                "\n With experience of having achieved this goal, review the rest of your goal plans: \n" +
                "•\tIf you have achieved the goal too easily make your \bnext goals harder.\n" +
                "•\tIf the goal took a dispiriting length of time to achieve, \bmake the next goal a little easier.\n" +
                "•\tIf you learned something that would lead you to \bchange other goals, do so.\n" +
                "•\tIf you noticed a deficit in your skills despite achieving \bthe goal, decide whether to set goals to fix this.\n" +
                "\nFailure to meet goals does not matter much, as long as you learn from it. Feed lessons learned into your goal setting program.  \n" +
                "\nRemember too that your goals will change as time goes on. Adjust them regularly to reflect growth in your knowledge and experience, and if goals do not hold any attraction any longer, then let them go.\n" +
                "\n" +
                "Key Points:\n" +
                "Goal setting is an important method of:\n" +
                "•\tDeciding what is important for you to achieve in your \blife;\n" +
                "•\tSeparating what is important from what is irrelevant, \bor a distraction;\n" +
                "•\tMotivating yourself; and\n" +
                "•\tBuilding your self-confidence based on successful \bachievement of goals.\n" +
                "If you have not already set goals, do so, starting now. As you make this technique part of your life, you’ll find your career accelerating, and you’ll wonder how you did without it!\n"));
    }

}