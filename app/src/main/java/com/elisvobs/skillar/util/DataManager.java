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
        mSkills.add(new Skill(R.string.goals, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.problem, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.creative, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.leadership, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.communications, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.assertiveness, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.conflict, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.team, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.stress, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.awareness, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.negotiation, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.time, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.decision, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.relationships, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.pressure, R.drawable.ic_menu_send));
        mSkills.add(new Skill(R.string.substance, R.drawable.ic_menu_send));
//        skills.add(new Skill(R.string.critical, R.drawable.ic_menu_send));
    }

    private void initializeGoalNotes() {
        mNotes.add(new Note("Find direction. Live your life your way", "Goal setting is a powerful process for thinking about your ideal future, and for motivating yourself to turn this vision of the future into reality. The process of setting goals helps you choose where you want to go in life. By knowing precisely what you want to achieve, you know where you have to concentrate your efforts. You will also quickly spot the distractions that would otherwise detract you from you course.\n" +
                "\n" +
                "Properly-set goals can be incredibly motivating and as you get into the habit of setting and achieving your goals, you will find that your self-confidence improves\n"));
        mNotes.add(new Note("Achieving more with focus", "Top-level athletes, successful business-people and achievers in all fields use goal-setting techniques. They give you long-term vision and short-term motivation. They focus your acquisition of knowledge and help you to organize your time and your resources so that you can make the very most of your life.\n" +
                "\n" +
                "By setting sharp, clearly defined goals, you can measure and take pride in the achievement of those goals. You can see forward progress in what might previously have seemed a long pointless grind. By setting goals, you will also raise your self-confidence, as you recognize your ability and competence in achieving the goals that you have set.\n"));
        mNotes.add(new Note("Starting to set personal goals", "Goals are set on a number of different levels:\n" +
                "•\tFirst you create your “big picture” of what you want to do with your life and decide what large-scale goals you want to achieve.\n" +
                "•\tSecond you break these down into smaller and smaller targets that you must hit so that you reach your lifetime goals.\n" +
                "•\tFinally, once you have your plan, you start working to achieve it.\n" +
                "\n" +
                "We start this process with your Lifetime Goals, and work down to the things you can do today to start moving towards them.\n"));
        mNotes.add(new Note("Starting to achieve your lifetime goals", ""));
        mNotes.add(new Note("Staying on course", ""));
    }

}