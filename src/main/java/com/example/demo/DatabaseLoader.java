package com.example.demo;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DatabaseLoader implements CommandLineRunner {
    @Autowired
	private PlaylistRepository playlistrepository;
    @Autowired
    private VideoRepository videoRepository;
    @Autowired
    private CommentRepository commentRepository;

	@Override
	public void run(String... strings) throws Exception {
        Video video1 = new Video("code0001","Season 7 Ep. 1", "youtube.com/ss7ep1");
        Comment video1comment1 = new Comment("สู้ๆ เลดี้หมีน้อย2",video1);
        this.videoRepository.save(video1);
        this.commentRepository.save(video1comment1);


		Video video2 = new Video("code0002","Season 7 Ep. 2", "youtube.com/ss7ep2");
		Comment video2comment1 = new Comment("พ่อหล่อล่ำของหนู",video2);
		Comment video2comment2 = new Comment("King in the North!",video2);
        this.videoRepository.save(video2);
        this.commentRepository.save(video2comment1);
        this.commentRepository.save(video2comment2);



		Video video3 = new Video("code0003","Season 7 Ep. 3", "youtube.com/ss7ep3");
		Comment video3comment1 = new Comment("สโอ้ว แม่สาวน้อยเธอพ่นไฟอีกแล้ว",video3);
        this.videoRepository.save(video3);
        this.commentRepository.save(video3comment1);


		Set<Video> videos = new HashSet<Video>(){
			{
				add(video1);
				add(video2);
				add(video3);
			}
		};

		this.playlistrepository.save(new Playlist("Game of Throne Playlist",videos));
	}
}