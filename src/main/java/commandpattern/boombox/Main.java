package commandpattern.boombox;

import commandpattern.boombox.player.MusicPlayer;
import commandpattern.boombox.player.MusicPlayerRemote;
import commandpattern.boombox.player.command.PlayFirstTrackCommand;
import commandpattern.boombox.player.command.PlayNextTrackCommand;
import commandpattern.boombox.player.command.PlayRandomTrackCommand;

public class Main {

    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
