package com.enrol

class BootStrap {

    def init = { servletContext ->
	def course = new Course(
			department:'Computing',			
			title:'BSc Hon Computing',
			leader:'Dr Micheele Murphy',
			code:'CS123',
			startDate:new Date('09/09/2018'),
			endDate:new Date('07/07/2022'),
			studyMode:'Fulltime',
			description:'La De Da',
			numberOfStudents:55,
			tuitionFees:9000.60).save()
	def database = new Course(
			department:'Computing',			
			title:'BSc Hon Database',
			leader:'Dr John Murphy',
			code:'CS124',
			startDate:new Date('09/09/2018'),
			endDate:new Date('07/07/2022'),
			studyMode:'Fulltime',
			description:'La De Da',
			numberOfStudents:55,
			tuitionFees:9000.60).save()
	def javascript = new Course(
			department:'Computing',			
			title:'BSc Hon Javascript',
			leader:'Dr Steve Murphy',
			code:'CS124',
			startDate:new Date('09/09/2018'),
			endDate:new Date('07/07/2022'),
			studyMode:'Fulltime',
			description:'La De Da',
			numberOfStudents:55,
			tuitionFees:9000.60).save()

	def Rob = new Student(
			name:'Rob Baggaley',
			studentID:'b6042302',
			dob:new Date('27/05/1971'),
			isFundingAvailable:true,
			email:'bob@live.co.uk',
			username:'longshanks',
			password:'password',
			course:'BSc Hon Computing').save()
	def Dave = new Student(
			name:'Dave Allen',
			studentID:'b4092502',
			dob:new Date('16/08/1979'),
			isFundingAvailable:true,
			email:'dave@live.co.uk',
			username:'davester',
			password:'openup',
			course:'BSc Hon Computing').save()
	def PeterM = new Student(
			name:'Peter Mann',
			studentID:'b4072502',
			dob:new Date('16/03/1979'),
			isFundingAvailable:true,
			email:'peter@live.co.uk',
			username:'petester',
			password:'openup',
			course:'BSc Hon Computing').save()

	def Peter = new Lecturer(
				fullName:'Peter Shaw',
				post:'Tutor',
				subject:'Maths',
				lecturerEmail:'petershaw@aol.com',
				office:'Leeds',
				bio:'Nice Guy').save()
	def David = new Lecturer(
				fullName:'David Shaw',
				post:'Tutor',
				subject:'English',
				lecturerEmail:'davidshaw@aol.com',
				office:'Leeds',
				bio:'Nice Guy').save()
	def Matt = new Lecturer(
				fullName:'Matt Shaw',
				post:'Tutor',
				subject:'French',
				lecturerEmail:'mattshaw@aol.com',
				office:'Hull',
				bio:'Nice Guy').save()

	def mod1 = new Module(
				title:'module1',
				code:'mod1',
				credits:5,
				lecturer:'Matt Shaw',
				course:'BSc Hon Javascript',
				description:'lovely').save()
	def mod2 = new Module(
				title:'module2',
				code:'mod2',
				credits:10,
				lecturer:'David Shaw',
				course:'BSc Hon Javascript',
				description:'lovely').save()
	def mod3 = new Module(
				title:'module3',
				code:'mod3',
				credits:15,
				lecturer:'Peter Shaw',
				course:'BSc Hon Javascript',
				description:'lovely').save()
	def Andy = new Leader(
				fullName:'Andy Peters',
				department:'Computing',
				subject:'Maths',
				leaderEmail:'andya@aol.com',
				username:'andya',
				password:'password',
				office:'Leeds',
				bio:'nice').save()
	def Roger = new Leader(
				fullName:'Roger Daltery',
				department:'Computing',
				subject:'English',
				leaderEmail:'roger@aol.com',
				username:'roger',
				password:'password',
				office:'Leeds',
				bio:'nice').save()
	def Scott = new Leader(
				fullName:'Scott Joplin',
				department:'Computing',
				subject:'French',
				leaderEmail:'scott@aol.com',
				username:'scott',
				password:'password',
				office:'Leeds',
				bio:'nice').save()
				

	
    }
    def destroy = {
    }
}
