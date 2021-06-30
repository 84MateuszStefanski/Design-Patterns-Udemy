package commandpattern.boombox.player.command;

import commandpattern.boombox.player.MusicPlayer;

public class PlayNextTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayNextTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
