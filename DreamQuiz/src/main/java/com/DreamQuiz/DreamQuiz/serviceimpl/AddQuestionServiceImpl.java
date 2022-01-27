package com.DreamQuiz.DreamQuiz.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DreamQuiz.DreamQuiz.Repository.CurrentAfairsRepository;
import com.DreamQuiz.DreamQuiz.Repository.ExamdetailsRepository;
import com.DreamQuiz.DreamQuiz.Repository.OldPaperRepository;
import com.DreamQuiz.DreamQuiz.Repository.QueationRepository;
import com.DreamQuiz.DreamQuiz.Repository.SubTopicRepository;
import com.DreamQuiz.DreamQuiz.Repository.SubjectRepository;
import com.DreamQuiz.DreamQuiz.Repository.TopicRepository;
import com.DreamQuiz.DreamQuiz.Repository.VideodetalsRepository;
import com.DreamQuiz.DreamQuiz.entity.CurrentAffairs;
import com.DreamQuiz.DreamQuiz.entity.Examdetails;
import com.DreamQuiz.DreamQuiz.entity.OldPaper;
import com.DreamQuiz.DreamQuiz.entity.Queations;
import com.DreamQuiz.DreamQuiz.entity.SubTopics;
import com.DreamQuiz.DreamQuiz.entity.Subject;
import com.DreamQuiz.DreamQuiz.entity.Topics;
import com.DreamQuiz.DreamQuiz.entity.Videodetails;

@Service
public class AddQuestionServiceImpl {

	@Autowired
	SubjectRepository subjectRepository;
	@Autowired
	TopicRepository topicRepository;
	@Autowired
	QueationRepository queationRepository;
	@Autowired
	SubTopicRepository subTopicRepository;
     @Autowired
     CurrentAfairsRepository currentAfairsRepository;
	@Autowired
	OldPaperRepository oldPaperRepository;
	@Autowired
	VideodetalsRepository videodetalsRepository;
	@Autowired
	ExamdetailsRepository examdetailsRepository ;
	public Subject addNewSubject(Subject subject) {
		
		return subjectRepository.save(subject);
	}

	public Topics addnewtopic(Topics topics) {
		
		return topicRepository.save(topics);
			
		
	}

	public SubTopics addnewsubtopic(SubTopics subTopics) {
	
		return subTopicRepository.save(subTopics);
	}

	public Queations addnewqueation(Queations queations) {
		
		
		return queationRepository.save(queations);
		
		
	}

	public List<Subject> getstudent() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}

	public Optional<Topics> findTpicsbySubjectid(long sid) {
		// TODO Auto-generated method stub
		
		System.out.println("service sid is "+sid);
		return topicRepository.findById(sid);
	}

	public Optional<SubTopics> findSubTopicsBytopicId(long tid) {
		
		return subTopicRepository.findById(tid);
	}

	
	
	
	
	      public List<Queations> getBysubtopicid(Long stid) {
			 return queationRepository.getDatabysubtopicidList(stid); 

	   // return queationRepository.findAll();
	 }

		
		

		public List<Topics> getTopicbysid(Long sid) {
			
			return topicRepository.getTopicBySid(sid);
		}

		public List<SubTopics> getSubTopicsbytid(Long tid) {
			// TODO Auto-generated method stub
			return subTopicRepository.getSubTopicsbytid(tid);
		}

		public List<String> getallsubject() {
			// TODO Auto-generated method stub
			return subjectRepository.findonlysubject();
		}

		public List<String> getAllTpoicfromdb(long sid) {
			// TODO Auto-generated method stub
			return topicRepository.findtopicbysid(sid);
		}

		public List<String> findsubtopicfromdb(long tid) {
			// TODO Auto-generated method stub
			return subTopicRepository.subtopicfromdb(tid);
		}

		public long getlastinsertpid() {
			// TODO Auto-generated method stub
			return queationRepository.getlastinsertpid();
		}

		public List<String> findallcrpdftitle() {
			// TODO Auto-generated method stub
			return currentAfairsRepository.findallcrpdftitle();
		}

	

		public CurrentAffairs addnewcapdf(CurrentAffairs curentafairs) {
			return currentAfairsRepository.save(curentafairs);
			
			
		}

		public List<String> findoldpapertitle() {
			
			return oldPaperRepository.selectoldpapertitle();
		}

		public OldPaper addnewoldpaperpdf(OldPaper oldpaper) {
			return oldPaperRepository.save(oldpaper);
			
		}

		public List<OldPaper> getoldpaperpdf() {
			// TODO Auto-generated method stub
			return oldPaperRepository.findAll();
		}

		public List<CurrentAffairs> getcurrentafairspdf() {
			// TODO Auto-generated method stub
			return currentAfairsRepository.findAll();
		}

		public List<String> videotitlefromdb() {
			// TODO Auto-generated method stub
			return videodetalsRepository.videotitlefromdb();
		}

		public Videodetails AddNewVideodetails(Videodetails videodetails) {
			return videodetalsRepository.save(videodetails) ;
			
			
		}

		public List<String> examnamefromdb() {
			// TODO Auto-generated method stub
			return examdetailsRepository.examnamefromdb() ;
		}

		public Examdetails AddExamdetails(Examdetails examdetails) {
			return examdetailsRepository.save(examdetails);
			// TODO Auto-generated method stub
			
		}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
