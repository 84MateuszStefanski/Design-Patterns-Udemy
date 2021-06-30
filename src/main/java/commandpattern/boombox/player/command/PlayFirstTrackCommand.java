package commandpattern.boombox.player.command;

import commandpattern.boombox.player.MusicPlayer;

public class PlayFirstTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayFirstTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
      musicPlayer.playFirstTruck();
    }
}
