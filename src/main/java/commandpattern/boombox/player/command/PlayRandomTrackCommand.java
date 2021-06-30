package commandpattern.boombox.player.command;

import commandpattern.boombox.player.MusicPlayer;

public class PlayRandomTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayRandomTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
